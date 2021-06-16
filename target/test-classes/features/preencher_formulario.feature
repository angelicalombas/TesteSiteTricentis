# language: pt
# encoding: utf-8

Funcionalidade: Preencher formulário Automobile Insurance

Cenário: Validar envio de e-mail com sucesso.
	Dado que estou no site da Sample
	E preencho os dados da aba "Enter Vehicle Data" e clico em Next
	E preencho os dados da aba "Enter Insurant Data" e clico em Next
	E preencho os dados da aba "Enter Product Data" e clico em Next
	E preencho os dados da aba "Select Price Option" e clico em Next
	E preencho os dados da aba "Send Quote"
	Quando clico em Send
	Então deve ser exibida a mensagem "Sending e-mail success!" na tela