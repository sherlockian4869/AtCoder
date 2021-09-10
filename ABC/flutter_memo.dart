// 削除・編集の際のdocumentIdの取得方法
// 削除・編集時のfirebaseとの連携
// Memberのdomainでやったようにdiaryのdomainでsnap.idで日誌のdocumentIdを取得

// 削除処理
// model・view側でdeleteのメソッドを呼出
// view側でid検索、一致したら削除できるようにする

// 更新処理
// 編集においては、フォームを作成
// documentIdを取得後、idに紐づいたdocumentを更新


// valueにfirebaseから取得した値を入れる

// 懸念点　※TexteditControllerについて調べる

// documentIdの持ち回り方
// diary_detailに値をどのように渡しているのか調べる
// title、articleそれぞれを画面遷移させているのであればついでにdoccumentIdも遷移させる
// その場合、valueにおいてもfirebaseから取得するのではなく、画面遷移でも渡した値を入れる

// その後、updateArticleメソッドを呼出で値を更新する