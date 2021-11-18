package com.example.plugincore;

import org.pf4j.PluginManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/core")
public class CoreController {

    @Autowired
    ApplicationContext context;

    @Autowired(required = false)
    PluginManager pluginManager;

    @GetMapping
    public String getBasicExtention() {
        Object basePluginService = context.getBean("basePluginService");
        return basePluginService.getClass().getSimpleName();
    }
}
