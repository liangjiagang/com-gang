
var testEditor;

$(function() {

});

(function ($) {
    /*Mean Menu Active*/
    jQuery('.header-menu nav').meanmenu({
        meanMenuContainer: '.mobile-menu',
        meanScreenWidth: "991"
    });
    /*editor.md Active*/
    $.get('editormd/test.md', function(md){
        testEditor = editormd("test-editormd", {
            placeholder:'本编辑器支持Markdown编辑，左边编写，右边预览',   //默认显示的文字，这里就不解释了
            width: "100%",                                  //宽度
            height: 200,                                   //固定高度
            autoHeight: true,                              //自动高度
            markdown : md,                                  //请求的默认厨师md文档
            //syncScrolling: "single",                        //同步滚动
            path: "../editormd/lib/",                       //你的path路径（原资源文件中lib包在我们项目中所放的位置）
            //theme: "dark",                                  //工具栏主题
            //previewTheme: "dark",                           //预览主题
            //editorTheme: "pastel-on-dark",                  //编辑主题
            saveHTMLToTextarea: true,                      //保存 HTML 到 Textarea
            markdownSourceCode : true,                     //是否保留 Markdown 源码，即是否删除保存源码的 Textarea 标签
            htmlDecode: "style,script,iframe|on*",          // 开启 HTML 标签解析，为了安全性，默认不开启
            searchReplace: true,
            codeFold: true,
            emoji: true,
            taskList: true,
            tocm: true,                                     // Using [TOCM]
            tex: true,                                      // 开启科学公式TeX语言支持，默认关闭
            flowChart: true,                                // 开启流程图支持，默认关闭
            sequenceDiagram: true,                          // 开启时序/序列图支持，默认关闭,
            //imageUpload: true,
            //imageFormats: ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
            //imageUploadURL: "examples/php/upload.php",
            toolbarIcons: function() {                      //自定义工具栏，后面有详细介绍
                return editormd.toolbarModes['full'];     // full, simple, mini
            },
        });
    });

})(jQuery);