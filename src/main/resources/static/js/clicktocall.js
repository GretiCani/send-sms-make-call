// Execute JavaScript on page load
$(function() {
    $('#userPhone, #salesPhone').intlTelInput({
        responsiveDropdown: true,
        autoFormat: true
    });
    var $form = $('#contactform'),
        $submit = $('#contactform input[type=submit]');

    // Intercept form submission
    $form.on('submit', function(e) {
        // Prevent form submission and repeat clicks
        e.preventDefault();
        $submit.attr('disabled', 'disabled');

        // Submit the form via ajax
        $.ajax({
            url:'/call',
            method:'POST',
            data: $form.serialize()
        }).done(function(data) {
            content = JSON.parse(data);
            alert(content.message);
        }).fail(function() {
            alert('There was a problem calling you - please try again later.');
        }).always(function() {
            $submit.removeAttr('disabled');
        });

    });
});