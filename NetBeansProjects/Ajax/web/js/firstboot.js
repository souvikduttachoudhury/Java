/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var ff=0;
var prev="fav";

function change_head(id){
    //alertalert("working");
    var txt=document.getElementById(id).innerHTML;
    //alert(txt);
    document.getElementById("change-header").innerHTML="<h2>"+txt+"</h2>";
    if(prev!==id){
    if(ff===0){
    document.getElementById("content-desc-i").innerHTML="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";
    document.getElementById("content-desc-main-i").innerHTML='This rather ugly, knobby, brown vegetable is actually the root of a special celery cultivated specifically for its root. Its also called celeriac, celery knob, turnip rooted celery and knob celery. Celery root tastes like a cross between a strong celery and parsley. Its available from October through April and can range anywhere from the size of an apple to that of a small cantaloupe. Choose a relatively small, firm celery root with a minimum of rootlets and knobs. Avoid those with soft spots, which signal decay. The green leaves are usually detached by the time you buy celery root. Refrigerate the root in a plastic bag for 7 to 10 days.<div class='+'"content-desc-main-author"'+'>-Ashton Jones</div>';       
    document.getElementById("image1").src="images/img4.png";
    document.getElementById("image2").src="images/img5.png";
    document.getElementById("image3").src="images/img6.png";
     ff++;
    }
    else{
        document.getElementById("content-desc-i").innerHTML='Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of "de Finibus Bonorum et Malorum" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, '+'"Lorem ipsum dolor sit amet.."'+', comes from a line in section 1.10.32.The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from "de Finibus Bonorum et Malorum" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.';
        document.getElementById("content-desc-main-i").innerHTML='The beet is the most intense of vegetables.The radish admittedly is, more feverish, but the fire of radish is a cold fire,the fire of discontent not of passion.Tomatoes are lusty enough,yet there runs through tomatoes an undercurrent of frivolity.Beets are deadly serious. <div class='+'"content-desc-main-author"'+'>-Tom Robbins</div>';
        document.getElementById("image1").src="images/img1.png";
        document.getElementById("image2").src="images/img2.png";
        document.getElementById("image3").src="images/img3.png";
        ff--;
    }
    }
    prev=id;
}