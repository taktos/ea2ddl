

set NATIVE_PROPERTIES_PATH=%1
IF "%DBFLUTE_ENVIRONMENT_TYPE%"=="" set DBFLUTE_ENVIRONMENT_TYPE=""

call %DBFLUTE_HOME%\etc\cmd\_df-copy-properties.cmd %NATIVE_PROPERTIES_PATH%

call %DBFLUTE_HOME%\ant\bin\ant -Ddfenv=%DBFLUTE_ENVIRONMENT_TYPE% -f %DBFLUTE_HOME%\build-torque.xml doc

mkdir .\output\doc
copy %DBFLUTE_HOME%\output\doc\project-schema-%MY_PROJECT_NAME%.html .\output\doc\project-schema-%MY_PROJECT_NAME%.html
