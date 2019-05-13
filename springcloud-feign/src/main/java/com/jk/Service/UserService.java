package com.jk.Service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-provider")
public interface UserService {
}
