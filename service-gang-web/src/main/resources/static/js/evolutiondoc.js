(function ($) {


})(jQuery);

function editUser() {
    var event = arguments.callee.caller.arguments[0] || window.event;
    event.preventDefault();
    var data_value = $(event.target).attr('data-value');
    var data_text = $(event.target).attr('data-text');
    var url1 = '/evolutiondoc/getprotmenu.do';
    if (data_value == "protf_menu_next") {
        /*$('#table_refresh').load(url1, //请求路径  同步请求方法
            reqData, //请求的数据
            function(response，status){//回调函数

        });*/
        //var formData = new FormData();
        //formData .append("page",data_text);

        $.ajax({
            type: 'POST',
            url: url1,
            //contentType : false,// 告诉jQuery不要去设置Content-Type请求头
            //processData: false,// 告诉jQuery不要去处理发送的数据
            contentType: 'application/json;charset=utf-8',
            //dataType: "json",
            data: '{"page":' + data_text + '}', //注意是""
            success: function (data) {
                $('#table_refresh').html(data);
            },
            error: function (errorMsg) {
            }
        });
    } else if (data_value == "protf_menu_last") {
        alert(data_value);
    } else {
        alert(data_value);
    }

    $(event.target).siblings('.active').removeClass('active');
    $(event.target).addClass('active');

};
