<!-- l10n-sync: source-file="README.md" -->
<div align="center">

# 🎲 Soc Ops

### Social Bingo para encontros presenciais

**Encontre pessoas que correspondam às perguntas. Faça 5 em linha. Ganhe!**

[![Java 21](https://img.shields.io/badge/Java-21-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.2-6DB33F?style=flat-square&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.9+-C71A36?style=flat-square&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue?style=flat-square)](LICENSE)
[![Deploy](https://img.shields.io/github/actions/workflow/status/MikeH865/my-soc-ops-java/deploy.yml?label=deploy&style=flat-square)](https://github.com/MikeH865/my-soc-ops-java/actions)

[🚀 Demo ao Vivo](https://copilot-dev-days.github.io/agent-lab-java/) · [📚 Guia do Lab](workshop/pt_BR/GUIDE.md) · [🐛 Reportar Bug](https://github.com/MikeH865/my-soc-ops-java/issues)

</div>

---

## 🎮 O que é o Soc Ops?

Soc Ops é um **jogo de Social Bingo baseado na web** projetado para eventos ao vivo, reuniões de equipe e encontros presenciais. Cada jogador recebe um cartão de bingo 5×5 único, repleto de prompts para encontrar pessoas — *"Alguém que fala mais de 2 idiomas"*, *"Alguém que aprendeu a programar depois dos 30"* — e corre para fazer cinco em linha conhecendo pessoas reais na sala.

> **Bônus:** Soc Ops também é um workshop prático para aprender o **Modo Agente do GitHub Copilot** no VS Code. Construa o jogo, redesenhe sua interface e lance novos recursos — tudo guiado por IA.

```
┌──────────┬──────────┬──────────┬──────────┬──────────┐
│ Fala 2+  │ Tem um   │ Aprendeu │ Prefere  │ Criou um │
│ idiomas  │ projeto  │ a codar  │ modo     │ app      │
│          │ pessoal  │ >30 anos │ escuro   │ mobile   │
├──────────┼──────────┼──────────┼──────────┼──────────┤
│ Usou IA  │ Prefere  │          │ Lê blogs │ Trabalha │
│ para     │ tabs em  │  GRÁTIS  │ de tech  │ remoto   │
│ debugar  │ vez de   │          │ semanal  │ em tempo │
│ código   │ espaços  │          │          │ integral │
├──────────┼──────────┼──────────┼──────────┼──────────┤
│  ...     │  ...     │  ...     │  ...     │  ...     │
└──────────┴──────────┴──────────┴──────────┴──────────┘
```

---

## ✨ Funcionalidades

- 🃏 **Cartões únicos** — cada jogador recebe um cartão embaralhado na hora
- ⭐ **Espaço livre** — o tile central é sempre pré-marcado
- 🏆 **Detecção de vitória instantânea** — linhas, colunas e diagonais
- 💾 **Estado persistente** — continue de onde parou (localStorage)
- 📱 **Mobile-first** — ótima aparência em qualquer tela
- 🎨 **Temático** — utilitários CSS personalizados facilitam a reformulação

---

## 🧪 Workshop do Lab

Este projeto também serve como um workshop guiado para dominar o **Modo Agente do GitHub Copilot**. Percorra as partes abaixo para aprimorar suas habilidades de desenvolvimento agêntico:

| Parte | Título | Tempo | O que você fará |
|:-----:|--------|:-----:|-----------------|
| [**00**](workshop/pt_BR/00-overview.md) | Visão Geral & Lista Rápida | — | Pré-requisitos e checklist de início rápido |
| [**01**](workshop/pt_BR/01-setup.md) | Configuração & Engenharia de Contexto | 15 min | Clone, configure e ensine a IA sobre seu projeto |
| [**02**](workshop/pt_BR/02-design.md) | Frontend Design-First | 15 min | Redesenhe a interface do zero com temas criativos |
| [**03**](workshop/pt_BR/03-quiz-master.md) | Quiz Master Personalizado | 10 min | Crie seus próprios temas de bingo com um agente personalizado |
| [**04**](workshop/pt_BR/04-multi-agent.md) | Desenvolvimento Multi-Agente | 20 min | Lance novos recursos com TDD e agentes de design em paralelo |

> 📝 Todos os guias ficam em [`workshop/pt_BR/`](workshop/pt_BR/) e funcionam offline.

---

## 🚀 Início Rápido

**Pré-requisitos:** [Java 21 JDK](https://adoptium.net/) · [Apache Maven 3.9+](https://maven.apache.org/) *(ou use o wrapper incluído)*

```bash
# 1. Executar a app
cd socops
./mvnw spring-boot:run
# → Abrir http://localhost:8080
```

```bash
# 2. Gerar um JAR
./mvnw clean package

# 3. Executar testes
./mvnw test
```

> 💡 **Prefere contêineres?** Abra no [Dev Container](.devcontainer) incluído para um ambiente totalmente configurado com Java, Maven e todas as extensões do VS Code pré-instaladas.

---

## 🛠️ Stack Tecnológica

| Camada | Tecnologia |
|--------|-----------|
| Linguagem | Java 21 |
| Framework | Spring Boot 3.4.2 |
| Build | Apache Maven (wrapper incluído) |
| Templates | Thymeleaf |
| Estilos | Utilitários CSS personalizados (inspirados no Tailwind) |
| Deploy | GitHub Pages (deploy automático no push para `main`) |

---

## 🤝 Contribuindo

Contribuições são bem-vindas! Por favor, leia [CONTRIBUTING.md](CONTRIBUTING.md) e siga o [Código de Conduta](CODE_OF_CONDUCT.md).

---

<div align="center">

Feito com ☕ e GitHub Copilot

</div>
