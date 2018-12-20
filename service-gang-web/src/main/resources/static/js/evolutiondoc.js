(function ($) {
        $('.protfolio-menu-active').on( 'click', 'li', function(event) {
            event.preventDefault();
            var data_value = $(this).attr('data-value');
            var data_text = $(this).attr('data-text');
            var url1 = '/evolutiondoc/getprotmenu';
            if(data_value=="protf_menu_next"){
                /*$('#table_refresh').load(url1, //请求路径  同步请求方法
                    reqData, //请求的数据
                    function(response，status){//回调函数

                });*/
                $.ajax({
                    type: 'POST',
                    url: url1,
                    contentType: 'application/json;charset=utf-8',
                    dataType: "json",
                    data:  '{"page":'+data_text+'}', //注意是""
                    success: function(data){
                        $('#table_refresh').html(data);
                    },
                    error : function(errorMsg) {
                    }
                });
            }else if (data_value=="protf_menu_last"){
                alert(data_value);
            } else{
                alert(data_value);
            }

            $(this).siblings('.active').removeClass('active');
            $(this).addClass('active');

        });

})(jQuery);
