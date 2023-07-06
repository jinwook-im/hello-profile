package com.gmarket.pipelinebluegreen.configuration;

import org.springframework.context.annotation.Import;

@Import({ProfileBlue.class, ProfileGreen.class})
public class ProfileConfig {
}
