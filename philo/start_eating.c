/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   start_eating.c                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: junggkim <junggkim@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/06/11 20:19:44 by junggkim          #+#    #+#             */
/*   Updated: 2023/06/12 21:28:31 by junggkim         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "philosophers.h"

void    pass_time(t_philo *philo)
{
	long long	start;
	long long	now;

	start = ft_get_time();
	while (philo->check->end)
	{
		now = ft_get_time();
		if ((now - start) >= wait_time)
			break ;
		usleep(10);
	}
}

void    ft_finish_check(t_philo *philo, t_check *check)
{
	int			i;
	long long	now;

	while (end 조건)
	{
		if ((check->eat_times != 0) && (check->philo_num == check->finished_eat))
			break ;
		i = 0;
		while (i < check->philo_num)
		{
			now = ft_get_time();
			if ((now - philo[i].last_eat_time) >= check->time_to_die)
			{
                printf("%ld %d died\n",ft_get_time(), philo->num); //고치셈
				break ;
			}
			i++;
		}
	}
}

void    ft_thread(void *ss)
{
    t_philo *philo;

    philo = ss;
    if (philo->id % 2)
        usleep(100);
    while (philo->check->end)
    {
        pthread_mutex_lock(&(philo->check->forks[philo->left_fork]));
        printf("%ld %d has taken a fork\n",philo->last_eat_time, philo->num);
        pthread_mutex_lock(&(philo->check->forks[philo->left_fork]));
        printf("%ld %d has taken a fork\n",philo->last_eat_time, philo->num);
        printf("%ld %d is eating\n",, philo->num);
        philo->last_eat_time = ft_get_time();
        philo->eaten_num++;
        pass_time(philo);
        pthread_mutex_unlock(&(philo->check->forks[philo->right_fork]));
        pthread_mutex_unlock(&(philo->check->forks[philo->left_fork]));
        if (philo->eaten_num == philo->check->eat_count)
            break ;
        printf("%ld %d is sleeping\n",philo->start_eat_time, philo->num);
        pass_time(philo);
        printf("%ld %d is thinking\n",philo->start_eat_time, philo->num);
    }
}

int start_eating(t_philo *philo, t_check *check)
{
    int i;

    if (check->number_of_philosophers == 1)
    {
        printf("%ld 1 has taken a fork\n", ft_get_time());
        usleep(check->time_to_die);
        printf("%ld 1 died\n", ft_get_time());
        free_all(philo, check);
        return (0);
    }
    i = -1;
    while (++i < check->number_of_philosophers)
    {
        philo[i].start_thread_time = ft_get_time();
        if (pthread_create(&(philo[i].thread), NULL, ft_thread, &(philo[i])))
            return (1);
    }
    ft_finish_check(philo, check);
    i = -1;
    while (++i < check->number_of_philosophers)
        pthread_join(philo[i].thread, NULL);
    free_all(philo, check);
    return (0);
}
 