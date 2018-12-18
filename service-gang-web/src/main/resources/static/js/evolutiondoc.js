(function ($) {

        $('.protfolio-menu-active').on( 'click', 'li', function(event) {
            event.preventDefault();
            var value = $(this).attr('data-value');

            $(this).siblings('.active').removeClass('active');
            $(this).addClass('active');

        });

})(jQuery);
