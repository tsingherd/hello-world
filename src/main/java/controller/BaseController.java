package controller;

import com.cainiao.iwant.tsc.client.service.ServiceUnitService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by guogen.lgg on 2016/7/15.
 */
@Controller
@RequestMapping("/admin")
public class BaseController {
    @Resource
    ServiceUnitService serviceUnitService;
    // 请求一门课程下的知识点
    @RequestMapping(path = "/{serviceId}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String getServiceUnitById(@PathVariable Long serviceId){
        return serviceUnitService.getServiceUnitAssById(serviceId).toString();
    }
}
