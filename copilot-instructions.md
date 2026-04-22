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

## Design Guide

### Philosophy
Soc Ops is a social, playful game — the UI should feel lively and distinctive, not generic. Prioritize designs that feel genuinely crafted for this context.

### Frontend Design Principles
Follow `.github/instructions/frontend-design.instructions.md` when building or modifying UI:
- **Typography**: Choose distinctive, context-appropriate fonts. Avoid system defaults (Arial, Inter, Roboto).
- **Color & Theme**: Use CSS variables for consistency. Commit to a cohesive palette with dominant colors and sharp accents.
- **Motion**: Prefer CSS-only animations. Focus on high-impact moments (page load reveals, state transitions) rather than scattering micro-interactions.
- **Backgrounds**: Use gradients, patterns, or layered effects to create atmosphere rather than flat solid colors.
- **Avoid "AI slop"**: No purple-gradient-on-white, no cookie-cutter layouts, no predictable component patterns.

### CSS Utilities
This project uses custom Tailwind-like utility classes defined in `socops/src/main/resources/static/css/app.css`. See `.github/instructions/css-utilities.instructions.md` for the full reference.

Key classes:
- Layout: `.flex`, `.flex-col`, `.grid`, `.grid-cols-5`, `.items-center`, `.justify-between`
- Colors: `.bg-accent` (primary blue), `.bg-marked` (selected green)
- Animation: `.transition-all`, `.animate-[bounce_0.5s_ease-out]`

Add new utilities to `app.css` following existing patterns. Use CSS variables (`:root`) for theming.

### Thymeleaf Templates
- Templates live in `socops/src/main/resources/templates/`
- Use Thymeleaf fragments for reusable components
- Apply utility classes directly on HTML elements; avoid inline styles

## Workshop Context
Educational materials in `workshop/` cover setup, design, quiz master, and multi-agent patterns. Reference guides for exercises.

## Build and Run
- Run: `cd socops && ./mvnw spring-boot:run` (http://localhost:8080)