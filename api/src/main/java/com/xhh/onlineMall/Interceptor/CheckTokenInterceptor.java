package com.xhh.onlineMall.Interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.scenario.effect.impl.prism.PrCropPeer;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 创建拦截器
 */
@Component
public class CheckTokenInterceptor implements HandlerInterceptor {

    /**
     * token校验拦截器
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       //请求头传值，处理浏览器预检
        String method = request.getMethod();
        if ("OPTIONS".equalsIgnoreCase(method)){
            return true;
            //后不执行
        }
        String token = request.getHeader("token");
        System.out.println("token______________+++++++++++++++++++++++++>>>>>>>>>>>>>>>>>>>"+token);
        if (token == null) {
            ResultVO vo = new ResultVO(ResStatus.NO, "请登录后操作", null);
            //没有token，未登录
            doResponse(response,vo);
        } else {
            //校验token
            //  String decode = Base64Utils.decode(token);
            JwtParser jwtParser = Jwts.parser().setSigningKey("xhh0628");
            //如果token解析正确，在有效期内正常执行，否则抛出异常
            try {
                //token校验通过
                Jws<Claims> claimsJws = jwtParser.parseClaimsJws(token);
                return true;
            } catch (ExpiredJwtException e) {
                //token校验正确但过期
                ResultVO vo = new ResultVO(ResStatus.NO, "登录过期请重新登录", null);
                doResponse(response,vo);
            } catch (UnsupportedJwtException e) {
                ResultVO vo = new ResultVO(ResStatus.NO, "登录token校验失败", null);
                doResponse(response,vo);
            } catch (Exception e) {
                ResultVO vo = new ResultVO(ResStatus.NO, "登录失败，请重新登录", null);
                doResponse(response,vo);
            }
        }
        //token校验失败，拦截器不放行
        return false;
    }

    private void doResponse(HttpServletResponse response,ResultVO vo) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter writerOut = response.getWriter();
        String s = new ObjectMapper().writeValueAsString(vo);
        writerOut.print(s);
        writerOut.flush();
        writerOut.close();
    }

}