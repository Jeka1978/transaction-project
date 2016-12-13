package com.credit.guard;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Evegeny on 13/12/2016.
 */
@Configuration
@ComponentScan(basePackages = "credit.guard")
@EnableAspectJAutoProxy
public class Config {
}
