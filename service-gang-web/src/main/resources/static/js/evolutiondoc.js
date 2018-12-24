(function ($) {


})(jQuery);

/**
 * 获取标签和文档袋
 */
function getProtMenu() {
    var event = arguments.callee.caller.arguments[0] || window.event;
    event.preventDefault();
    var data_value = $(event.target).attr('data-value');
    var data_text = $(event.target).attr('data-text');
    var url1 = '/evolutiondoc/getprotmenu.do';
    var url2 = '/evolutiondoc/getdocbag.do';
    if (data_value == "protf_menu_next" || data_value == "protf_menu_last") {
        /*$('#table_refresh').load(url1, //请求路径  同步请求方法
            reqData, //请求的数据
            function(response，status){//回调函数

        });*/
        //var formData = new FormData();
        //formData .append("page",data_text);

        $.ajax({
            type: 'POST',
            url: url1,
            async: true,
            //contentType : false,// 告诉jQuery不要去设置Content-Type请求头
            //processData: false,// 告诉jQuery不要去处理发送的数据
            contentType: 'application/json;charset=utf-8',
            //dataType: "json",
            data: '{"page":"' + data_text + '"}', //注意是""
            success: function (data) {
                $('#table_refresh').html(data);
            },
            error: function (errorMsg) {
            }
        });
    } else {

        $.ajax({
            type: 'POST',
            url: url2,
            async: true,
            //contentType : false,// 告诉jQuery不要去设置Content-Type请求头
            //processData: false,// 告诉jQuery不要去处理发送的数据
            contentType: 'application/json;charset=utf-8',
            //dataType: "json",
            data: '{"doc_bag_label":"' + data_value + '"}', //注意是""
            success: function (data) {
                $('#protfolio-active').html(data);
            },
            error: function (errorMsg) {
            }
        });
    }

    $(event.target).siblings('.active').removeClass('active');
    $(event.target).addClass('active');

}

/**
 * 打开文档袋
 */
function getDocDefault() {
    var event = arguments.callee.caller.arguments[0] || window.event;
    event.preventDefault();
    var doc_bag_id = $("#doc_bag_id").attr('text');
    var url = '#';
    //JSON.stringify($('#formDemo').serializeJSON()); fromdata转json

    $.ajax({
        type: 'POST',
        url: url1,
        async: true,
        //contentType : false,// 告诉jQuery不要去设置Content-Type请求头
        //processData: false,// 告诉jQuery不要去处理发送的数据
        contentType: 'application/json;charset=utf-8',
        //dataType: "json",
        data: '{"doc_bag_id":' + doc_bag_id + '}', //注意是""
        success: function (data) {
        },
        error: function (errorMsg) {
        }
    });

}

