/// @description All inputs!
// You can write your code in this editor

//MOVIMENT
if keyboard_check(ord("W")) {
	vspeed = -character_speed(vspeed);
}
else if keyboard_check(ord("S")) {
	vspeed = character_speed(vspeed);
}

else if keyboard_check(ord("A")) {
	hspeed = -character_speed(hspeed);
}
else if keyboard_check(ord("D")) {
	hspeed = character_speed(hspeed);
}
else {
	hspeed = 0;
	vspeed = 0;
}

//MOUSE
//character rotation
rspeed = 18;	//The higher the values, the faster the rotation
dir = 0;		//Direction used only for rotation
dir = point_direction(x, y, mouse_x, mouse_y);
image_angle += sin(degtorad(dir - image_angle)) * rspeed;
//shooting
/*
if mouse_check_button(mb_left) {
	var son_bullet = instance_create(x, y, bullet);
	son_bullet.speed = 10;
	son_bullet.direction = image_angle;
}
*/