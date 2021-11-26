echo off
echo ejecuta el estresador para sembrar los Cliente_WS_All
echo uso:
echo 4bis_estresa NumCltes NumSolicitudesPorClte HOSTNAME (en caso de omitirlo se usa localhost, si se omiten los Cliente_OpenESBs usa 15, 10 solicitudes por Cliente_OpenESB)
echo off

set cb=%cd%\tstRMI.jar

if [%1] NEQ [] goto conCliente_OpenESBs
java -jar %cb% Lanzador 15 Cliente_WS_All 10 localhost
goto fin

:conCliente_OpenESBs

if [%2] NEQ [] goto consolicitudes
java -jar %cb% Lanzador %1 Cliente_WS_All 15 localhost 
goto fin

:consolicitudes
if [%3] NEQ [] goto conHost
java -jar %cb% Lanzador %1 Cliente_WS_All %2 localhost
goto fin

:conHost
java -jar %cb% Lanzador %1 Cliente_WS_All %2 %3

:fin

rem java -jar "C:\Users\Yosshua\Desktop\ITAM\SEPTIMO\SIST-COM-ELEC\PARCIAL-2\tstRMI_L\dist\tstRMI_L.jar" Lanzador 5 Cliente_OpenESB 10 localhost