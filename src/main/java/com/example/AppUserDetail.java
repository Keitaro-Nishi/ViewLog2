import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;


@AllArgsConstructor
public final class AppUserDetail implements UserDetails {

    private final AppUser appUser;

    private final Collection<? extends GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return appUser.getPassword();
    }

    @Override
    public String getUsername() {
        return appUser.getStaffName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return appUser.isEnabled();
    }

    @Override
    public boolean isAccountNonLocked() {
        return appUser.isEnabled();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return appUser.isEnabled();
    }

    @Override
    public boolean isEnabled() {
        return appUser.isEnabled();
    }
}
