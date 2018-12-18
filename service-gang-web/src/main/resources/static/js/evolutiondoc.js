(function ($) {

        $('.protfolio-menu-active').on( 'click', 'li', function(event) {
            event.preventDefault();
            var data_value = $(this).attr('data-value');
            var data_text = $(this).attr('data-text');
            var url = '';
            if(data_value=="protf_menu_next"){
                alert(data_value);
            }else if (data_value=="protf_menu_last"){
                alert(data_value);
            } else{
                alert(data_value);
            }

            $(this).siblings('.active').removeClass('active');
            $(this).addClass('active');

        });

})(jQuery);
