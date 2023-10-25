# Projeto DIO: Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway - (Status do Projeto: Incompleto).

**Temática: Aluno e Curso. (Adaptando o projeto).**

# Diagrama De Classe do Projeto:

**Java RestFul Api.**

```mermaid
classDiagram
  class Aluno {
    - nome: String
    - RegistroAluno: RegistroAluno
    - funcionalidades: Funcionalidade[]
    - curso: Curso
    - noticias: Noticia[]
  }

  class RegistroAluno {
    - numero: int
    - Instituição: String
    - escola: String
    - bloco: String
  }

  class Funcionalidade {
    - icone: String
    - descricao: String
  }

  class Curso {
    - numero: int
    - nome: String
  }

  class Noticia {
    - icone: String
    - descricao: String
  }

  Aluno "1" *-- "1" RegistroAluno : RegistroAluno
  Aluno "1" *-- "*" Funcionalidade : funcionalidades
  Aluno "1" *-- "1" Curso : curso
  Aluno "1" *-- "*" Noticia : noticias
```
``