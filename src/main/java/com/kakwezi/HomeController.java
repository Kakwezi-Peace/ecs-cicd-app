package com.kakwezi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> home() {
        String html = """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>ECS CI/CD Lab</title>
                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            height: 100vh;
                            margin: 0;
                            background-color: #f0f4f8;
                        }
                        .card {
                            background: white;
                            padding: 40px 60px;
                            border-radius: 12px;
                            box-shadow: 0 4px 20px rgba(0,0,0,0.1);
                            text-align: center;
                        }
                        h1 {
                            color: #232f3e;
                            font-size: 2em;
                            margin-bottom: 10px;
                        }
                        h2 {
                            color: #ff9900;
                            font-size: 1.4em;
                            margin-bottom: 20px;
                        }
                        p {
                            color: #666;
                            font-size: 1em;
                        }
                        .badge {
                            background: #232f3e;
                            color: white;
                            padding: 6px 16px;
                            border-radius: 20px;
                            font-size: 0.85em;
                            margin-top: 20px;
                            display: inline-block;
                        }
                    </style>
                </head>
                <body>
                    <div class="card">
                        <h1>Kakwezi Peace</h1>
                        <h2>ECS CI/CD Lab</h2>
                        <p>Containerized Java Application</p>
                        <p>Running on Amazon ECS Fargate</p>
                        <div class="badge">AWS | Docker | Java | Spring Boot</div>
                    </div>
                </body>
                </html>
                """;
        return ResponseEntity.ok()
                .header("Content-Type", "text/html")
                .body(html);
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("healthy");
    }
}
