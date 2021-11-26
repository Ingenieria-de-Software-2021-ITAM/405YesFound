echo off
echo ejecuta el master para que (re)inicialice al servidor de disparo
echo uso:
echo 3_ejem Segs_a_Disparo HOSTNAME (en caso de omitirlo se usa localhost, si se omiten asimismo los segundos usa 15)
echo on


set cb=%cd%\tstRMI.jar

if [%1] NEQ [] goto conDeltaT
java -Djava.rmi.server.codebase=file:%cb% -jar %cb% Master localhost reset 15
goto fin

:conDeltaT
if [%2] NEQ [] goto conHost
java -Djava.rmi.server.codebase=file:%cb% -jar %cb% Master localhost reset %1
goto fin

:conHost
java -Djava.rmi.server.codebase=file:%cb% -jar %cb% Master %2 reset %1
:fin


