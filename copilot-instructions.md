---
description: Workspace instructions for Soc Ops - a Spring Boot social bingo game project with workshop guides.
---

# Soc Ops Workspace Instructions

## Mandatory Development Checklist
- [ ] Lint code
- [ ] Build project (`cd socops && ./mvnw clean package`)
- [ ] Run tests (`cd socops && ./mvnw test`)

## Project Overview
Soc Ops is a Spring Boot web app for social bingo games in in-person mixers. Players match questions for 5-in-a-row bingo. Includes workshop materials for multi-agent development.

## Tech Stack
- Java 21, Spring Boot 3.4.2, Maven
- Thymeleaf templates, custom CSS utilities (Tailwind-like)
- REST API with MVC pattern, Spring DevTools

## Code Structure
- `socops/src/main/java/com/socops/`: Core code (SocOpsApplication, model/, service/, web/, data/)
- `socops/src/main/resources/`: Config, templates, static assets
- `socops/src/test/`: Unit tests

## Development Guidelines
- Use Java 21 and Spring Boot best practices
- Follow REST conventions
- Use custom CSS utilities (see `.github/instructions/css-utilities.instructions.md`)
- Add unit tests for new features
- Use Maven wrapper (`./mvnw`)

## Workshop Context
Educational materials in `workshop/` cover setup, design, quiz master, and multi-agent patterns. Reference guides for exercises.

## Build and Run
- Run: `cd socops && ./mvnw spring-boot:run` (http://localhost:8080)