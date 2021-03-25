package com.daxue.book;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author daxue0929
 * @date 2021/03/25
 **/

@ConfigurationProperties(prefix = "server")
@Component
@Data
public class TestConfiguration {

    private String port;

}
