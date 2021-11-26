echo off
echo inicializa el servidor de disparo
echo uso:
echo 2_ejesd HOSTNAME (en caso de omitirlo se usa localhost)
echo on

set cb=%cd%\tstRMI.jar

if [%1] NEQ [] goto conHost
java -Djava.rmi.server.codebase=file:%cb% -jar %cb% ServidorDeDisparo 
goto fin

:conHost
java -Djava.rmi.server.codebase=file:///%cb% -jar %cb% ServidorDeDisparo %1

:fin
