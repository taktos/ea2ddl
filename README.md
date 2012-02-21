ea2ddl
======

[Enterprise Architect](http://www.sparxsystems.jp/ea.htm) で作成したER図からDDLを生成します。
利用者が変更可能なテンプレートを使用しているため、Enterprise ArchitectのDDL生成機能ではカバーできない、柔軟なDDL生成をサポートします。現時点ではMySQLとOracle向けのテンプレートが用意されています。

Enterprise Architectで作成したファイル（*.eap）はMicrosoft Accessデータベースそのものです。ea2ddlは、JDBC-ODBCブリッジドライバを利用して直接EAPファイルからテーブル定義を読み取ります。そのため、ea2ddlの実行にはEnterprise Architectは不要です。

ea2ddl
======

Generate DDL from table definition in Enterprise Architect. It uses the customizable template to generate DDL. So you can generate various style DDL. It comes two templates, MySQL and Oracle.

The file created by Enterprise Architect (*.eap) is JUST the Microsoft Access file. Ea2ddl reads the eap file directly using JDBC-ODBC bridge driver. So you don't need to install Enterprise Architect to execute ea2ddl.

