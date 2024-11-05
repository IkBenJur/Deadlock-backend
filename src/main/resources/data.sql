INSERT INTO `ability_effect` (`ability_effect_id`, `effect`, `value`) VALUES (NULL, 'Charges', '1'), (NULL, 'Cooldown Between Charges', '7s'), (NULL, 'Radius', '6.5m'), (NULL, 'Damage', '80'), (NULL, 'Movement slow', '40%'), (NULL, 'Slow Duration', '4s');

INSERT INTO `ability` (`ability_id`, `ability_number`, `cooldown`, `description`, `name`, `upgrade_one`, `upgrade_three`, `upgrade_two`) VALUES (NULL, '1', '22', 'Throw a grenade that explodes in a cloud of freezing ice, damaging and slowing enemies.', 'Frost Grenade', '+1 Charges', '+175 Damage', 'Frost Grenade now heals 125 HP to friendly targets. Scales with Spirit.');

INSERT INTO `ability_ability_effect` (`ability_effect_id`, `ability_id`) VALUES ('1', '1'), ('2', '1'), ('3', '1'), ('4', '1'), ('5', '1'), ('6', '1');

INSERT INTO `ability_effect` (`ability_effect_id`, `effect`, `value`) VALUES (NULL, 'Duration', '8s'), (NULL, 'Move Speed', '+2m/s'), (NULL, 'Sprint Speed', '+2m/s Spring Speed');

INSERT INTO `ability` (`ability_id`, `ability_number`, `cooldown`, `description`, `name`, `upgrade_one`, `upgrade_three`, `upgrade_two`) VALUES (NULL, '2', '42', 'Kelvin creates a floating trail of ice and snow that gives movement bonuses to him and his allies. Kelvin gains 60% slow resistance. \r\nPress [LEFT SHIFT] / [LEFT CTRL] to travel up or down while in Ice Path.', 'Ice Path', '+4m/s Sprint Speed', 'While active, gain +1 Spirit Power per meter of Ice Path trail created. Max of 55 Spirit Power', '-16s Cooldown');

INSERT INTO `ability_ability_effect` (`ability_effect_id`, `ability_id`) VALUES ('7', '2'), ('8', '2'), ('9', '2');

INSERT INTO `ability_effect` (`ability_effect_id`, `effect`, `value`) VALUES (NULL, 'Channel Time', '5s'), (NULL, 'Beam Length', '25m'), (NULL, 'DPS', '60'), (NULL, 'Max Slow', '40%'), (NULL, 'Max Fire Rate Slow', '40%'), (NULL, 'Slow Linger', '2s'), (NULL, 'Max Slow Build Time', '2s');

INSERT INTO `ability` (`ability_id`, `ability_number`, `cooldown`, `description`, `name`, `upgrade_one`, `upgrade_three`, `upgrade_two`) VALUES (NULL, '3', '24', 'Shoot freezing cold energy out in front of you, damaging targets and building up movement and fire rate slow against them the longer you sustain the beam on them. You have reduced movement speed while using Arctic Beam.', 'Arctic Beam', '-8s Cooldown', 'Fires 2 Additional Arctic Beams toward enemies within 13m of the last target hit', '+40 DPS');

INSERT INTO `ability_ability_effect` (`ability_effect_id`, `ability_id`) VALUES ('10', '3'), ('11', '3'), ('12', '3'), ('13', '3'), ('14', '3'), ('15', '3'), ('16', '3');

INSERT INTO `ability_effect` (`ability_effect_id`, `effect`, `value`) VALUES (NULL, 'Radius', '10m'), (NULL, 'Duration', '5.5s'), (NULL, 'Health Regen', '+120'), (NULL, 'Movement Slow', '35%');

INSERT INTO `ability` (`ability_id`, `ability_number`, `cooldown`, `description`, `name`, `upgrade_one`, `upgrade_three`, `upgrade_two`) VALUES (NULL, '4', '127', 'Kelvin freezes the air around him, creating an impenetrable dome around himself. While in the dome, allies rapidly regenerate health and enemies are slowed.', 'Frozen Shelter', '+40% Fire Rate Slow', '+70 Health Regen and now scales with Spirit Power', '-40s Cooldown');

INSERT INTO `ability_ability_effect` (`ability_effect_id`, `ability_id`) VALUES ('17', '4'), ('18', '4'), ('19', '4'), ('20', '4');

INSERT INTO `hero` (`ammo`, `bullet_damage`, `bullet_per_seconds`, `bullet_resist`, `dps`, `heavy_melee`, `hero_id`, `light_melee`, `max_health`, `move_speed`, `regen`, `spirit_resist`, `sprint_speed`, `stamina`, `description`, `name`) VALUES ('15', '21', '4', '0', '83', '116', NULL, '63', '600', '6.5', '2', '0', '0', '3', 'Kelvin is a beginner-friendly hero who can adapt to a wide range of playstyles. \r\n\r\nWant to be a tanky frontliner? Prefer to be more supportive with heals? Split push and apply pressure across the map? He’s your guy.', 'Kelvin');

INSERT INTO `item_effect` (`item_effect_id`, `effect`) VALUES (NULL, '+24% Ammo'), (NULL, '+15% Weapon Damage');

INSERT INTO `item` (`active`, `cost`, `item_id`, `name`, `type`) VALUES (b'0', '500', NULL, 'Basic Magazine', 'WEAPON');

INSERT INTO `item_item_effect` (`item_effect_id`, `item_id`) VALUES ('1', '1'), ('2', '1');

INSERT INTO `item_set` (`item_set_id`, `name`) VALUES (NULL, 'Early Game');

INSERT INTO `item_set_item` (`item_id`, `item_set_id`) VALUES ('1', '1');

INSERT INTO `build` (`hero_id`, `build_id`, `created_at`, `description`, `name`) VALUES ('1', NULL, '2024-11-05 10:30:12.000000', 'Best Kelvin Build', 'Kelvin Build');

INSERT INTO `build_item_sets` (`build_build_id`, `item_sets_item_set_id`) VALUES ('1', '1');

INSERT INTO `hero_builds` (`hero_hero_id`, `builds_build_id`) VALUES ('1', '1');