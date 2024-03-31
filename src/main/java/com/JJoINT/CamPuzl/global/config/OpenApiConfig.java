package com.JJoINT.CamPuzl.global.config;

import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "CamPuzl",
                        url = "https://github.com/K-JJoINT/CamPuzl_BackEnd"
                ),
                description = "CamPuzl Service",
                title = "CamPuzl",
                version = "v0.0.1"
        ),
        security = {
                @SecurityRequirement(name = "bearerAuth")
        }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT를 사용한 인증",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}
