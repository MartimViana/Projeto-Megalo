/// @description Test enemy behaviour
// You can write your code in this editor

//If the player goes within range, the enemy will try to shoot it!
if abs(x - player.x) < 300 or abs(y - player.y) < 300 {
		//The enemy faces towards the player
			rspeed = 18;	//The higher the values, the faster the rotation
			dir = 0;		//Direction used only for rotation
			dir = point_direction(x, y, player.x, player.y);
			image_angle += sin(degtorad(dir - image_angle)) * rspeed;
		
		//The actual bullet
			var bullet = instance_create_depth(x + x * cos(image_angle), y + y * sin(image_angle), 10, obj_bullet);
			//Setting the bullet direction
				bullet.image_angle = image_angle;
				bullet.direction = image_angle;
			//Setting the bullet speed
				bullet.speed = speed + 30;
}