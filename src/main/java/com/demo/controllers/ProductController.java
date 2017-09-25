package com.demo.controllers;

import com.demo.dto.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Preetham on 25/09/17.
 *
 * @author Preetham
 * @version 1
 *
 */
@RestController
@RequestMapping("/product")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully retrieved list"),
        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
})
@Api(value="list my name",description="tets swaggwer")
public class ProductController {
    //TODO-bob this needs to be refactored
    //TODO-john new job for preetham
    @ApiOperation(value="returns my name",response = String.class)
    @RequestMapping(value="myname",method = RequestMethod.GET)
    public String MyName(@RequestParam("name") String name){
        System.out.println(name);
        return name;
    }


    @ApiOperation(value="returns student",response = Student.class)
    @RequestMapping(value="student",method = RequestMethod.POST)
    public Student MyName(@RequestBody Student student){
        System.out.println(student.getName());
        return student;
    }

}
