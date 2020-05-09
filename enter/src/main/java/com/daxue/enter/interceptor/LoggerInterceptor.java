//package com.daxue.enter.interceptor;
//
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class LoggerInterceptor implements HandlerInterceptor {
//
//    /**
//     *
//     * 拦截器中的方法按照preHandle -> Controller -> postHandle ->  afterCompletion 的顺序执行
//     * 只有preHandle的方
//     *法返回true时,后面的方法才会执行
//     *
//     * @param request
//     * @param response
//     * @param handler
//     * @return
//     * @throws Exception
//     */
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        System.out.println("LoggerInterceptor >>> preHandle");
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        System.out.println("LoggerInterceptor >>> postHandle");
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        System.out.println("LoggerInterceptor >>> afterCompletion");
//    }
//
//
//}
