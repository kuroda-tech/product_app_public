商品紹介アプリ（Product Introduction App）

概要
このアプリは、Java（JSP / Servlet）を使用して作成した"商品管理・紹介アプリ"です。  
商品情報の登録・編集・削除・検索などを行うことができます。  
データベースにはMariaDBを使用し、MVCモデルを意識した構成にしています。

使用技術
 項目と内容 
 言語=Java（Servlet / JSP)
 フレームワークなし（自作MVC構成） 
 データベース=MariaDB |
 開発環境：Eclipse / Tomcat 9 / MAMP  
 その他=JDBC, HTML / CSS 

 
主な機能
- 商品の一覧表示  
- 新規登録フォーム  
- 編集機能  
- 削除機能  
- 検索機能  


### アプリ画面
![トップページ（一覧表示）](https://github.com/kuroda-tech/product_app_public/blob/main/product_app_public/images/%E3%82%B9%E3%82%AF%E3%83%AA%E3%83%BC%E3%83%B3%E3%82%B7%E3%83%A7%E3%83%83%E3%83%88%202025-11-13%2010.55.40.png?raw=true)

### 商品一覧
![商品一覧](https://github.com/kuroda-tech/product_app_public/blob/main/product_app_public/images/%E3%82%B9%E3%82%AF%E3%83%AA%E3%83%BC%E3%83%B3%E3%82%B7%E3%83%A7%E3%83%83%E3%83%88%202025-11-13%2010.56.09.png?raw=true)

### 登録画面
![登録画面](https://github.com/kuroda-tech/product_app_public/blob/main/product_app_public/images/%E3%82%B9%E3%82%AF%E3%83%AA%E3%83%BC%E3%83%B3%E3%82%B7%E3%83%A7%E3%83%83%E3%83%88%202025-11-17%2010.59.00.png?raw=true)

### 商品検索画面
![商品検索画面](https://github.com/kuroda-tech/product_app_public/blob/main/product_app_public/images/%E3%82%B9%E3%82%AF%E3%83%AA%E3%83%BC%E3%83%B3%E3%82%B7%E3%83%A7%E3%83%83%E3%83%88%202025-11-13%2010.56.37.png?raw=true)


## 工夫した点
- サーブレットとJSPを分離し、処理と画面表示を明確に分けた。  
- DAOパターンを導入し、データベース操作を整理。  
- 一覧画面のレイアウトを見やすくCSSで調整。
- バリデーションエラー時の入力値保持など、ユーザーが操作しやすいように工夫しました。  
- 商品名検索では部分一致検索を実装し、柔軟な検索が可能です。
- ペンのアイコンで商品編集、ゴミ箱アイコンで商品削除が可能


## 学んだこと
- JSPとServletの連携方法  
- フォームからのデータ送信とバリデーション処理  
- MVC設計の基本的な考え方  
- GitHubでのソースコード管理
- エラーに対する最新の注意と対策


## ディレクトリ構成
product_app_public/
├── index.jsp                # トップページ（一覧画面）
├── css/                     # スタイルシート
│   └── style.css
├── images/                  # アプリのスクリーンショット
├── WEB-INF/
│   ├── web.xml              # サーブレット設定
│   ├── jsp/                 # JSPファイル（登録・編集など）
│   └── src/                 # Servlet・DAO・DTOなどJavaソース
├── LICENSE
└── README.md


　## 今後の展望
 - 今後はSpring Bootやフロントエンドとの連携を通して、より実践的なWebアプリ開発を学んでいく予定です。
 - 重要なメソッドやAPIを記憶し、いついかなる場面でも対処できるよう面接が終わってからも復習していきます。
