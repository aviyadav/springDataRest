/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.sample.springdata.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author q845332
 */
@SpringBootApplication
@EnableSwagger2
public class SpringDataRest {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRest.class, args);
    }
}
