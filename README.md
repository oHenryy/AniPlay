# AniPlay

AniPlay é um aplicativo de streaming desenvolvido em Kotlin que simula um serviço para assistir a desenhos japoneses (animes). O objetivo do aplicativo é permitir aos usuários navegar por diferentes títulos, gerenciar suas listas de favoritos, e assistir a animes diretamente em seus dispositivos móveis.

## Funcionalidades

- **Navegação por Títulos**: Explore uma vasta coleção de animes organizados por categorias.
- **Lista de Favoritos**: Adicione seus animes preferidos a uma lista personalizada para fácil acesso.
- **Reprodução de Vídeos**: Assista a episódios diretamente no aplicativo com suporte para múltiplas resoluções.
- **Perfil do Usuário**: Gerencie suas preferências, histórico de visualização, e configurações de conta.

## Estrutura do Projeto

### `src/main/java/com.example.projeto_aniplay`

- **Model**
  - `UserModel`: Responsável pela lógica de dados do usuário, como favoritos e histórico de visualização.
  
- **Presenter**
  - `FirebaseConfig`: Configurações para integração com o Firebase, incluindo autenticação e armazenamento.
  - `UserPresenter`: Lógica de apresentação e mediação entre o Model e a View para gerenciar o perfil e as interações do usuário.
  
- **Util**
  - `Util`: Classe utilitária com métodos auxiliares, como manipulação de dados e formatação.
  
- **View**
  - `FormCadastro`: Tela de cadastro de novos usuários.
  - `FormLogin`: Tela de login.
  - `MainActivity`: Tela principal do aplicativo, que pode exibir os animes disponíveis.
  - `PerfilUsuario`: Tela de exibição e edição do perfil do usuário, incluindo favoritos e histórico.
  - `Redefinir_senha`: Tela para redefinição de senha.

### `res/layout`

- **activity_form_cadastro.xml**: Layout para a tela de cadastro.
- **activity_form_login.xml**: Layout para a tela de login.
- **activity_home.xml**: Layout da tela inicial, exibindo categorias de animes e recomendações.
- **activity_main.xml**: Layout principal do aplicativo.
- **activity_perfil_usuario.xml**: Layout para a tela de perfil do usuário, incluindo configurações de conta e listas personalizadas.
- **activity_redefinir_senha.xml**: Layout para a tela de redefinição de senha.

### `res/drawable`, `res/mipmap`, `res/values`

- **Drawable**: Armazena imagens e ícones utilizados no aplicativo, como capas de animes e ícones de categorias.
- **Mipmap**: Contém ícones do aplicativo em diferentes resoluções.
- **Values**: Arquivos de valores para strings, cores, temas, etc.

## Requisitos

- Android Studio 4.0 ou superior
- Gradle 6.5 ou superior
- Kotlin 1.4 ou superior

## Instalação

1. Clone este repositório em sua máquina local usando o comando:
   ```
   git clone https://github.com/seu-usuario/AniPlay.git
   ```
2. Abra o projeto no Android Studio.
3. Certifique-se de que o Android Studio está configurado com o SDK Android necessário.
4. Sincronize o Gradle para garantir que todas as dependências sejam baixadas corretamente.

## Executando o Projeto

1. Conecte um dispositivo Android ou inicie um emulador no Android Studio.
2. Clique em "Run" ou pressione `Shift + F10` para compilar e executar o aplicativo no dispositivo selecionado.
