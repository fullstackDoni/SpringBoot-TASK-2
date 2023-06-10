package kz.bitlab.techorda.springtasksecond.service;

import kz.bitlab.techorda.springtasksecond.models.ApplicationRequest;
import kz.bitlab.techorda.springtasksecond.repository.AppReq;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AppReqService {

    private AppReq appReq;

//    public List<ApplicationRequest> allRequests(){
//        return AppReq.findAll();
//    }
//    public ApplicationRequest getRequestById(Long id){
//        return AppReq.findById(id).orElse(null);
//    }
//    public void save(ApplicationRequest request){
//        AppReq.save(request);
//    }
//    public void delete(Long id){
//        AppReq.deleteById(id);
//    }
//    public ApplicationRequest findRequest(Long id){
//        return  AppReq.findById(id).orElse(null);
//    }
}
