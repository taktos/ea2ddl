@echo off

%~d0
cd %~p0
call _project.bat

rem /nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
rem Specify the file path to be used as build-properties.
rem nnnnnnnnnn/
set MY_PROPERTIES_PATH=build-%MY_PROJECT_NAME%.properties

rem /nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
rem Execute {Document}.
rem nnnnnnnnnn/
call %DBFLUTE_HOME%\etc\cmd\_df-doc.cmd %MY_PROPERTIES_PATH%

pause


