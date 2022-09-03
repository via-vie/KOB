//每一个vue文件都是三个标签
<template>
  <div>
	<div>Bot昵称：{{bot_name}}</div><!--通过后端取得-->
	<div>Bot战力：{{bot_rating}}</div>
  </div>
  <router-view></router-view>
</template>//html

<script>//固定写法
import $ from 'jquery'
import {ref} from 'vue';

export default{
	name: "App",
	setup : ()=>{
		let bot_name = ref("");
		let bot_rating = ref("");
		
		$.ajax({
			url:"http://127.0.0.1:3000/pk/getbotinfo/",
			type: "get",//获取数据
			success: resp=>{
				bot_name.value = resp.name;
				bot_rating.value = resp.rating;
			}
		})
		
		return{
			bot_name,
			bot_rating
		}
	}//函数的入口
}
</script><!--//js-->

<style>
	body{/*@表示当前文件的根目录。~类似相对路径*/
		background-image:url("~@/assets/bg.png");
		background-size:cover;
	}
</style><!--//css-->
