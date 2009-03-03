#!/bin/sh

NATIVE_PROPERTIES_PATH=$1

sh $DBFLUTE_HOME/etc/cmd/_df-copy-properties.sh $NATIVE_PROPERTIES_PATH

if [ "$answer" = "y" ] ;then
  export answer=y
else
  # {From Mr.Akikusa}
  read -p "Database will be initialized. Are you ready? (y or n) " answer
fi
if [ $answer = "y" ] ;then
    $DBFLUTE_HOME/ant/bin/ant -Ddfenv=$DBFLUTE_ENVIRONMENT_TYPE -f $DBFLUTE_HOME/build-torque.xml replace-schema
fi
