# singleton Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

1. Acesse os métodos nos dois e informe qual o problema ocorrido com a alteração do código do updateConfig.
  Ao alterar as informações no método updateConfig pelos dois serviços REST (/config e /relatorio), percebi que foi criada duas instâncias do Singleton Config, fazendo assim com que o projeto não funcionasse como deveia, permitindo que apenas uma instância seja feita por vez.
