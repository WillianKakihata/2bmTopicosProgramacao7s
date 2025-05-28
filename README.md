# 2bmTopicosProgramacao7s Projeto (backend)

## Como rodar a aplicação

1. Certifique-se de ter o Docker e o Docker Compose instalados.

2. No terminal, na raiz do projeto (onde está o `compose.yaml`), rode:

```bash
docker compose up --build
```

3. Aguarde os containers buildarem e iniciarem.

## Acessando a aplicação
### Jsons da aplicação:  
1. ACESSAR o LINK json  
https://eadcesumar-my.sharepoint.com/:u:/g/personal/ra22015763-2_aluno_unicesumar_edu_br/EQzixrMnS-ZPuKuoFmVp7eMBcPBu0o8lVM6T6VJkiPPN_g?e=ien55x
2. Baixar o json  
3. Depois seja inserido no Postman ou insomnia.  


ou criar as rotas:  
- **URL (PORTA)**: `http://localhost:8080`

--- 

### ➕ Registrar Usuario
- **URL**: `/auth/register`
- **Método**: `POST`
- **Request Body**:
```json

{
	"login": "ADMIN1",
	"password": "senha123",
	"role": "ADMIN" // <- ADMIN OU USER
}

```
- **Resposta**: `200 Okay` (sem corpo)
---

### ➕ Logar Usuario
- **URL**: `/auth/login`
- **Método**: `POST`
- **Request Body**:
```json

{
	"login": "ADMIN1",
	"password": "senha123"
}

```
- **Resposta**: `200 Okay` (sem corpo)
---


### ➕ Criar Tarefas (APENAS ADMINS)
- **URL**: `/tarefas`
- **Método**: `POST`
- **Request Body**:
```json

	{
		"titulo": "titulo",
		"descricao": "ver se da bom",
		"status": "INICIO"
	}

```
- **Resposta**: `201 Created` 

---

### 📄 Listar Todos as Tarefas (APENAS USUARIOS E ADMINS)
- **URL**: `/tarefas`
- **Método**: `GET`
- **Resposta**:
```json
[
	{
		"titulo": "titulo",
		"descricao": "ver se da bom",
		"status": "INICIO"
	}
]
```

---

### 📄 Listar uma das Tarefas (APENAS USUARIOS E ADMINS)
- **URL**: `/tarefas/{id}`
- **Método**: `GET`
- **Resposta**:
```json
	{
		"titulo": "titulo",
		"descricao": "ver se da bom",
		"status": "INICIO"
	}
```

---

### 🔄 Atualizar Tarefas (APENAS ADMINS)
- **URL**: `/tarefas/{id}`
- **Método**: `PUT`
- **Parâmetro**: `id` (long) — ID da tarefa a ser atualizado
- **Request Body**:

- **Resposta**: Objeto atualizado `204 No Content`

---

### ❌ Deletar Tarefas (APENAS ADMINS)
- **URL**: `/tarefas/{id}`
- **Método**: `DELETE`
- **Parâmetro**: `id` (long) — ID da tarefa a ser atualizado
- **Resposta**: `204 No Content`

---

## Comandos úteis

- Parar a aplicação:  
  ```bash
  docker compose down
  ```

- Rodar em modo detach (em background):  
  ```bash
  docker compose up --build -d
  ```

---
