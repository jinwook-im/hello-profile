package com.gmarket.pipelinebluegreen.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"green"})
public class ProfileGreen {

}
