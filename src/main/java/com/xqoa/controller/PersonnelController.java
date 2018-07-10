package com.xqoa.controller;

import com.xqoa.dto.PersonInput;
import com.xqoa.dto.PersonOut;
import com.xqoa.entity.Personnel;
import com.xqoa.model.Result;
import com.xqoa.model.ResultGenerator;
import com.xqoa.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author YSK
 * @date
 */
@RestController
@RequestMapping(value = "/person")
public class PersonnelController {

    @Autowired
    private PersonnelService personnelService;

    @RequestMapping(value = "/savePersonnel",method = RequestMethod.POST)
    public Result createPersonnel (Personnel personnel){
         int i = personnelService.insertPersonnel(personnel);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping(value = "/getPersonnelById/{id}",method = RequestMethod.GET)
    public Result getPersonnelById(@PathVariable int id){
        Personnel personnel = personnelService.selectPersonnelById(id);
        PersonOut personOut = PersonOut.transForm(personnel);
        return ResultGenerator.genSuccessResult(PersonOut.transTypeName(personOut));
    }

    @RequestMapping(value = "/updataPersonnerlById",method = RequestMethod.POST)
    public Result updataPersonnerlById(Personnel personnel){
        personnelService.updateNonEmptyPersonnelById(personnel);
        return ResultGenerator.genSuccessResult();
    }
    
    @RequestMapping(value = "/savePerson",method = RequestMethod.POST)
    public Result savePerson (@RequestBody  PersonInput personInput){
        personnelService.insertPersonnelInput(personInput);
        return ResultGenerator.genSuccessResult(personInput);
    }

    @RequestMapping(value = "/queryByAddr",method = RequestMethod.GET)
    public Result queryByAddr(String queryAddr,Integer queryAddrId){
        List<PersonOut> list = personnelService.queryByAddr(queryAddr,queryAddrId);
        return ResultGenerator.genSuccessResult(list);
    }

    @RequestMapping(value = "/queryName",method = RequestMethod.POST)
    public Result queryName(String queryName){
        List<PersonOut> personOut = personnelService.queryName(queryName);
        return ResultGenerator.genSuccessResult(personOut);
    }
}
