
# JetPackAuthApp

Este é um aplicativo Android desenvolvido utilizando **Jetpack Compose** e **Firebase Authentication** para implementar um sistema de autenticação de usuários. O aplicativo permite que os usuários se registrem com e-mail e senha, façam login e, após a autenticação bem-sucedida, sejam redirecionados para uma tela de boas-vindas.

## 📱 Funcionalidades

- Registro de usuários com e-mail e senha.
- Login de usuários autenticados.
- Exibição de mensagens de erro durante falhas de autenticação.
- Redirecionamento para a tela de boas-vindas após o login.
- Logout do usuário autenticado.

## 🛠️ Tecnologias Utilizadas

- **Kotlin**: Linguagem de programação principal.
- **Jetpack Compose**: Biblioteca moderna para criação de interfaces declarativas.
- **Firebase Authentication**: Serviço de autenticação para gerenciar usuários.
- **Material Design**: Layout responsivo e moderno.

## 🚀 Como Executar o Projeto

### Pré-requisitos

1. **Android Studio** instalado (versão mais recente recomendada).
2. **Conta no Firebase** configurada.

### Configuração do Firebase

1. Acesse [Firebase Console](https://console.firebase.google.com/) e crie um projeto.
2. Adicione um aplicativo Android ao projeto.
3. Insira o `applicationId` (ex.: `com.example.jetpackauthapp`) durante a configuração.
4. Baixe o arquivo `google-services.json` e coloque-o no diretório `app/` do seu projeto.
5. Ative o Firebase Authentication no console do Firebase.

### Rodando o Projeto

1. Clone o repositório para a sua máquina:

   ```bash
   git clone https://github.com/Phillipe17Macedo/JetPackAuthApp.git
   ```

2. Abra o projeto no Android Studio.
3. Sincronize o Gradle para instalar as dependências.
4. Configure o SDK para usar **Java 11**.
5. Conecte um dispositivo ou emulador.
6. Execute o aplicativo:

   ```bash
   ./gradlew installDebug
   ```

## 🗂️ Estrutura do Projeto

```
JetPackAuthApp
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/jetpackauthapp/
│   │   │   │   ├── MainActivity.kt      # Activity principal
│   │   │   │   ├── viewModel/AuthViewModel.kt  # Lógica de autenticação
│   │   │   │   ├── ui/
│   │   │   │   │   ├── LoginScreen.kt    # Tela de login
│   │   │   │   │   ├── WelcomeScreen.kt  # Tela de boas-vindas
│   │   │   │   │   ├── theme/
│   │   │   │   │   │   ├── Theme.kt      # Configuração de tema
│   │   │   │   │   │   ├── Typography.kt # Estilo de texto
│   │   │   │   │   │   ├── Shape.kt      # Estilo de bordas
│   │   ├── res/
│   │   │   ├── values/                  # Arquivos de estilo e cores
│   ├── build.gradle
```

## 📸 Capturas de Tela

### Tela de Login
![Login Screen](https://via.placeholder.com/500x300?text=Login+Screen)

### Tela de Registro
![Register Screen](https://via.placeholder.com/500x300?text=Register+Screen)

### Tela de Boas-Vindas
![Welcome Screen](https://via.placeholder.com/500x300?text=Welcome+Screen)

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

Feito com ❤️ por [Phillipe Macedo](https://github.com/Phillipe17Macedo).
