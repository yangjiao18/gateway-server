package com.maka.gatewayserver.jwt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author Administrator
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JwtModel {

    private String userName;

    private List<String> roleIdList;

}
