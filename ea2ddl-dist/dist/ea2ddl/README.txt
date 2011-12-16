===============================================================================
= EA2DDL - Enterprise Architect to DDL
= Version 0.0.1 (2008/10/26)
===============================================================================

* これは何？
Enterprise Architect (http://www.sparxsystems.jp/) で作成したER図から、DDLを出力するためのツールです。
EAのファイル（*.eap）をODBC経由で直接読み込み、FreeMarkerのテンプレートでDDLを出力します。

* 主な機能
- Table, PK, FK, Index, Uniqueに関するDDLの出力
- 別名とノートをコメントとして出力
- FreeMarkerテンプレートで出力結果をカスタマイズ
- コメントはDBFlute 0.8.2以降のフォーマットに対応
- DBFluteの区分値フォーマットに対応（単独のノートとして記述してある前提）

* 使い方
+ ER図を保存した*.eapファイルのODBCデータソースを作成する
-- *.eapファイルは実際MicrosoftのAccessデータベースです
+ jdbc.diconに設定したJDBCのURLを、↑で作成したデータソース名に修正する
		<property name="URL">
			"jdbc:odbc:exampledb" <!-- jdbc:odbc:[ODBCデータソース名] -->
		</property>
+ DDLを出力する対象のパッケージの、ルートパッケージからのパスをea2ddl.propertiesに指定する
		er.package.tree=ビュー/クラスビュー/EXAMPLEDB
-- パッケージ名の区切りはスラッシュ「/」もしくはピリオド「.」が利用できます
-- propertiesファイルなのでnative2asciiする
+ antを実行する
		ant -f build-ea2ddl.xml

* 謝辞
- DBFluteをMS-Access対応にして下さったid:jfluteさん
- AntタスクからS2Containerを利用するためにs2jdbc-genのコードを流用しました

