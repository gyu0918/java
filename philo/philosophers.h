/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   philosophers.h                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: junggkim <junggkim@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/06/07 15:55:28 by junggkim          #+#    #+#             */
/*   Updated: 2023/06/15 02:25:40 by junggkim         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#ifndef PHILOSOPHERS_H
# define PHILOSOPHERS_H

# include <stdio.h>
# include <unistd.h>
# include <pthread.h>
# include <sys/time.h>
# include <string.h>

typedef struct s_check
{
    int time_to_die;
    int time_to_eat;
    int time_to_sleep;
    int number_of_philosophers;
    int eat_count;
    int end;
    pthread_mutex_t *forks;
    pthread_mutex_t print;
}   t_check;

typedef struct s_philo
{
    int num;
    int left_fork;
    int right_fork;
    int eaten_num;
    long last_eat_time;
    long start_thread_time;
    pthread_t	thread;
    struct s_check  *check;
}   t_philo;

#endif