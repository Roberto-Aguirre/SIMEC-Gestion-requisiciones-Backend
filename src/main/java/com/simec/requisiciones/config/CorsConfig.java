// package com.simec.requisiciones.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
// public class CorsConfig {

//     @Bean
//     public WebMvcConfigurer corsConfigurer() {
//         return new WebMvcConfigurer() {
//             @Override
//             public void addCorsMappings(CorsRegistry registry) {
//                 registry.addMapping("/api/v1/**") // Define qué rutas se ven afectadas
//                         .allowedOrigins("http://localhost","http://localhost:4200") // Orígenes permitidos
//                         .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos HTTP
//                         .allowedHeaders("*") // Permitir todos los headers (Auth, Content-Type, etc)
//                         .allowCredentials(true); // Permitir cookies o auth headers
//             }
//         };
//     }
// }