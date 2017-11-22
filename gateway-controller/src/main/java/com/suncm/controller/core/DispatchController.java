package com.suncm.controller.core;

import com.suncm.controller.handlers.CommandHandler;
import com.suncm.entity.Request;
import com.suncm.entity.Response;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sunchangming on 2017/11/20.
 */
@RestController
public class DispatchController {

    //private static final org.slf4j.Logger logger = LoggerFactory.getLogger("suncm");

    @RequestMapping(value = "/command")
    public Response command(@RequestBody Request request, HttpServletRequest httpServletRequest) throws Exception {
        Response response = new Response();

        WebApplicationContext springContext = WebApplicationContextUtils.getWebApplicationContext(httpServletRequest.getSession().getServletContext());
        CommandHandler handler = (CommandHandler) springContext.getBean(request.getServiceType());

        return handler.handle(request, response);
    }
}
