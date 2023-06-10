package kz.bitlab.techorda.springtasksecond.controller;

import kz.bitlab.techorda.springtasksecond.models.ApplicationRequest;
import kz.bitlab.techorda.springtasksecond.repository.AppReq;
import kz.bitlab.techorda.springtasksecond.service.AppReqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private AppReq appReq;

    @GetMapping(value = "/")
    public String index(Model model){
        List<ApplicationRequest> applicationRequests = appReq.findAll();
        model.addAttribute("appreq",applicationRequests);
        return "index";
    }
    @GetMapping("/add")
    public String addRequest(Model model) {
        List<ApplicationRequest> applicationRequests = appReq.findAll();
        model.addAttribute("appreq", applicationRequests);
        return "redirect:/";
    }

    @PostMapping("/AddReq")
    public String addRequest(ApplicationRequest request) {
        request.setHandled(true);
        ApplicationRequest.save(request);
        return "redirect:/";
    }
    @GetMapping("/details/{requestId}")
    public String requestDetails(@PathVariable Long requestId, Model model) {
        ApplicationRequest request = appReq.getReferenceById(requestId);
        if (request == null) {
            return "error";
        }
        model.addAttribute("request", request);
        return "details";
    }
//    @PostMapping("/update")
//    public String update(ApplicationRequest request){
//        if(request!=null){
//            request.setHandled(false);
//            AppReqService.save(request);
//        }
//        return "redirect:/";
//    }
//    @PostMapping("delete/{requestId}")
//    public String delete(@PathVariable Long requestId){
//        AppReqService.delete(requestId);
//        return "redirect:/";
//    }
}
